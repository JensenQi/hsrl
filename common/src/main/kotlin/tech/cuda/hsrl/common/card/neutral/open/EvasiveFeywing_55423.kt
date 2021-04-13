package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EvasiveFeywing_55423 : Card() {
    override val id = 55423
    override val name = "辟法灵龙"
    override val description = "无法成为法术或英雄技能的目标。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "我从没听说过这只叫“光明之翼”的精灵龙。但如果我听过的话，我一定要说：我们是最好的朋友。"
    override val artist = "Concept Art House"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a2715aa5b75f49f6d1a64315f74ede0ff904e05e39ada1b97242387bb7206e69.png"
}
