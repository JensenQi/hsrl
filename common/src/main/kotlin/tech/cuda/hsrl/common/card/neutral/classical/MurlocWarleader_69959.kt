package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MurlocWarleader_69959 : Card() {
    override val id = 69959
    override val name = "鱼人领军"
    override val description = "所有其他鱼人获得+2/+1。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "鱼人们老是发出一样的声音，难道不觉得厌烦吗？不！姆格拉咕嗯噜咕噜咕噜咕噜咕噜！"
    override val artist = "Tim McBurnie"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2acb504392df858a0ab12021805b8e708a991cfbb8c74ef2f8dab0e029398b41.png"
}
