package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EmpOperative_49172 : Card() {
    override val id = 49172
    override val name = "电磁脉冲特工"
    override val description = "<b>战吼：</b> 消灭一个机械。"
    override var cost: Int? = 5
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "我说这事非得我出马不行 所有人都给我过来这里听 因为我们需要一点E.M.P. 因为它们只能由我来搞定"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/afff72c390916649a334a0727439be6986d7f501761705d387e3148491ca004b.png"
}
