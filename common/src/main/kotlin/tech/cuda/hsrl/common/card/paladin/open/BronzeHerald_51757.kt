package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BronzeHerald_51757 : Card() {
    override val id = 51757
    override val name = "青铜传令官"
    override val description = "<b>亡语：</b>将两张4/4的“青铜龙”置入你的手牌。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.RiseOfShadows
    override val background = "两军交战，不斩来使，是有其道理的。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3b19044dcf5f1c3ce2abd7afdb7c735936280a361fb4928acac8bf12d3fc8e39.png"
}
