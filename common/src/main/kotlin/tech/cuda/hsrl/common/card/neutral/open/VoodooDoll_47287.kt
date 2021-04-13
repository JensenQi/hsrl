package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VoodooDoll_47287 : Card() {
    override val id = 47287
    override val name = "巫毒娃娃"
    override val description = "<b>战吼：</b>选择一个随从。<b>亡语：</b>消灭选择的随从。"
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "“噢，我太喜欢它了！看起来跟我很像。”"
    override val artist = "Charlene Le Scanff"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5ef23f6c0dec2b929364899f178fd5d01d16aab446d7b250f078a4eb9620161a.png"
}
