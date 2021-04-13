package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DollmasterDorian_47298 : Card() {
    override val id = 47298
    override val name = "人偶大师多里安"
    override val description = "每当你抽到一张随从牌，召唤一个它的1/1复制。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "小朋友都很好奇玩具盒里的抓痕都是从哪儿来的。"
    override val artist = "J. Axer"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0ca3ce12f55d877a9bdfb9c5924b64ea03e3a44e7e74a3387b1a3d17fc9ccbd9.png"
}
