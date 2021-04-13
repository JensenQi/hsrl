package tech.cuda.hsrl.common.card.demonhunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SoulShear_59725 : Card() {
    override val id = 59725
    override val name = "灵魂剥离"
    override val description = "对一个随从造成 3点伤害。将两张灵魂残片洗入你的 牌库。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "“再往边上靠一点，再靠一点。”"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7fd84558c738ec7346c32f4306c332b5393bf5dabc81a03bbccb8e23e1c40db1.png"
}
