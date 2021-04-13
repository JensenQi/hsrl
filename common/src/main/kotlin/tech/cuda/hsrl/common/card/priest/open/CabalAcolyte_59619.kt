package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CabalAcolyte_59619 : Card() {
    override val id = 59619
    override val name = "秘教侍僧"
    override val description = "<b>嘲讽，法术迸发：</b>随机获得一个攻击力小于或等于2的敌方随从的控制权。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "为何他能在班级中名列前茅？全靠牵线搭桥掌握了控制权！"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/23aaefe03be690afa4c6e33d6e8388b967b2cbbb621c740c225c239c04a8a867.png"
}
