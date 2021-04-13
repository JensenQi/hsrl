package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MurlocWarleader_1063 : Card() {
    override val id = 1063
    override val name = "鱼人领军"
    override val description = "你的其他鱼人获得+2攻击力。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "鱼人们老是发出一样的声音，难道不觉得厌烦吗？不！姆格拉咕嗯噜咕噜咕噜咕噜咕噜！"
    override val artist = "Tim McBurnie"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/18665c11f2d135458018bfc93099e570efe659f6954f812982d619690761214a.png"
}
