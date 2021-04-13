package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Crackle_2006 : Card() {
    override val id = 2006
    override val name = "连环爆裂"
    override val description = "造成 3到 6点伤害，<b>过载：</b>（1）"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Gvg
    override val background = "在施放这个法术的时候最好提前带上耳塞。"
    override val artist = "Warren Mahy"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ecda7be3572bbc387a9f9f906049a2a213370c841babd568d9884562ebb1466a.png"
}
