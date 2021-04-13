package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StewardOfScrolls_59027 : Card() {
    override val id = 59027
    override val name = "卷轴管理者"
    override val description = "<b>法术伤害+1</b> <b>战吼：</b><b>发现</b>一张法术牌。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "完蛋了，我把墨水元素洒在小论文上了！"
    override val artist = "Ware Lee"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5e514c9f676b6d7f0fbd3f0ca01bb5da3f3e396e353419eb9eb82e90fd0932ea.png"
}
