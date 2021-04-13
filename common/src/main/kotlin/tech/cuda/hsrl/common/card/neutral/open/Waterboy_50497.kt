package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Waterboy_50497 : Card() {
    override val id = 50497
    override val name = "茶水小弟"
    override val description = "<b>战吼：</b> 在本回合中，你的下一个英雄技能的法力值消耗为（0）点。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "100%纯正有机的巨魔汗水。"
    override val artist = "Ekaterina Shapovalova"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e81ba61068065699fb2ed9041d4a256bdab17e59703fa69c0b3b582834c3941a.png"
}
