package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FaceCollector_47599 : Card() {
    override val id = 47599
    override val name = "面具收集者"
    override val description = "<b>回响，战吼：</b>随机将一张<b>传说</b>随从牌置入你的手牌。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.TheWitchwood
    override val background = "“我想用玛法里奥换你的安度因。”"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2d6bd17ccd39dc0ac23074733a95ac8cfd931d77b2ee3a8d02d4d0771fbe5804.png"
}
