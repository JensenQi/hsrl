package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PerditionsBlade_391 : Card() {
    override val id = 391
    override val name = "毁灭之刃"
    override val description = "<b>战吼：</b>造成1点伤害。<b>连击：</b>改为造成2点伤害。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Legacy3
    override val background = "当拉格纳罗斯还买不起萨弗拉斯的时候，他的武器正是毁灭之刃。"
    override val artist = "Daren Bader"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f29c9510cdbdb54047acfedd4254702c0ec12d1f7df9de039d298637ab00ca87.png"
}
