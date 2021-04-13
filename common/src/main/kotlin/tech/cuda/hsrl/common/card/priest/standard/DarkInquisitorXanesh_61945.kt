package tech.cuda.hsrl.common.card.priest.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DarkInquisitorXanesh_61945 : Card() {
    override val id = 61945
    override val name = "黑暗审判官夏奈什"
    override val description = "<b>战吼：</b> 使你手牌和牌库中的所有<b>腐蚀</b>牌的法力值消耗减少（2）点。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "恐惧，是意志的吞噬者，也是我那条巨虫的名字。"
    override val artist = "Jaemin Kim"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2d46c9e6d0b87b9202fe13599b0f22df4bcda8804556eaea57f68dcd60789120.png"
}
