package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MogushanWarden_700 : Card() {
    override val id = 700
    override val name = "魔古山守望者"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 4
    override var health: Int? = 7
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "这些家伙们每天做的就是谈论雷神。真无聊！"
    override val artist = "Cole Eastburn"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a9ed15aadec1771f4fa88ea762134e411ac1c853fe60bacb61b20bed79c29afc.png"
}
