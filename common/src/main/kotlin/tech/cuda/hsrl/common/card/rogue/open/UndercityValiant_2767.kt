package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UndercityValiant_2767 : Card() {
    override val id = 2767
    override val name = "幽暗城勇士"
    override val description = "<b>连击：</b>造成1点伤害。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Tgt
    override val background = "生前是暴风城勇士，死后就成了幽暗城勇士。"
    override val artist = "Zoltan Boros "
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/47a6f5cdebc34495a002d99ee74ab60c34e5f9b9d287cd6d8af90f791d102a12.png"
}
