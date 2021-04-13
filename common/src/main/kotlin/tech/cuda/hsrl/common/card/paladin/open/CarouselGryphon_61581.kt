package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CarouselGryphon_61581 : Card() {
    override val id = 61581
    override val name = "旋转木马"
    override val description = "<b>圣盾</b>，<b>腐蚀：</b>获得+3/+3和<b>嘲讽</b>。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "“这玩意什么时候能到暴风城飞行点？我都飞了好几个小时了！”"
    override val artist = "Vladimir Kafanov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/43406a5726bfa9b9b57828204f9aaff7027b7504e937addc69e83b38ff906e92.png"
}
