package tech.cuda.hsrl.common.card.demonhunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VengefulSpirit_63166 : Card() {
    override val id = 63166
    override val name = "复仇之魂"
    override val description = "<b>流放：</b>抽两张<b>亡语</b>随从牌。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "嘘，恶魔猎手就算变成了灵魂，也忘不了复仇。"
    override val artist = "Wayne Wu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/26c3b668dcc87467e2ff6cd2e312d4439b6f6bb558f354f5cc9d31144d04f660.png"
}
