package tech.cuda.hsrl.common.card.hunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Saddlemaster_61966 : Card() {
    override val id = 61966
    override val name = "鞍座管理员"
    override val description = "在你使用一张野兽牌后，随机将一张野兽牌置入你的手牌。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "座套，检查完毕。喷漆，检查完毕。杯架，检查完毕。"
    override val artist = "Vladimir Kafanov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/255cfb42b1ac6df135c96720fe20a236702a85394e8a81eea4f48e2d1f94081e.png"
}
