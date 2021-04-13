package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Lucentbark_51795 : Card() {
    override val id = 51795
    override val name = "卢森巴克"
    override val description = "<b>嘲讽，亡语：</b>进入<b>休眠</b>状态。累计恢复5点生命值可唤醒该随从。"
    override var cost: Int? = 8
    override var health: Int? = 8
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.RiseOfShadows
    override val background = "泥土之中稍作长眠，周身上下焕然一新。"
    override val artist = "Steven Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f1db9138ab09bebfd29ee185fcf5de1085305ca1bc96b7eda377aad97f64d0e1.png"
}
