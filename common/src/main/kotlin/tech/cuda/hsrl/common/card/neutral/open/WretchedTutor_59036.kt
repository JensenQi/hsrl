package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WretchedTutor_59036 : Card() {
    override val id = 59036
    override val name = "失心辅导员"
    override val description = "<b>法术迸发：</b>对所有其他随从造成2点伤害。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "“要是你喜欢我的辅导，那你也一定会喜欢我那当美术老师的妹妹，当司机的父亲，还有当管家的母亲。”"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/493b22b6ba5d021377318f79e3f78d2af467333ba484e6f23e75c94463ca8bcb.png"
}
