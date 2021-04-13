package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StormwindKnight_68388 : Card() {
    override val id = 68388
    override val name = "暴风城骑士"
    override val description = "<b>冲锋</b>"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "对于“死亡之翼毁城事件”，他仍然耿耿于怀。"
    override val artist = "Ladronn"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f1d2f93511afa7561a260b6831e3592215314f59ef94fff1551c95f7a700be85.png"
}
