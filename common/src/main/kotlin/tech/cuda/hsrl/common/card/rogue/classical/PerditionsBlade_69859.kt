package tech.cuda.hsrl.common.card.rogue.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PerditionsBlade_69859 : Card() {
    override val id = 69859
    override val name = "毁灭之刃"
    override val description = "<b>战吼：</b>造成1点伤害。<b>连击：</b>改为造成2点伤害。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ClassicCards
    override val background = "当拉格纳罗斯还买不起萨弗拉斯的时候，他的武器正是毁灭之刃。"
    override val artist = "Daren Bader"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/68473ffe9a9950a76ae30c9a37666cd0ad7150cfb66a772af9070c6c115d15df.png"
}
