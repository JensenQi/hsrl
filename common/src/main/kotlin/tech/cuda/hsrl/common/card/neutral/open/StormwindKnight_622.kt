package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StormwindKnight_622 : Card() {
    override val id = 622
    override val name = "暴风城骑士"
    override val description = "<b>冲锋</b>"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "对于“死亡之翼毁城事件”，他仍然耿耿于怀。"
    override val artist = "Ladronn"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/309c3953449876e0f4aec1f8e4959b1b2e426461cff5b0996db764d092e55364.png"
}
