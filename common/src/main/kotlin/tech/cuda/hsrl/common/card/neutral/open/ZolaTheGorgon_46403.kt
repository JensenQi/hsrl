package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ZolaTheGorgon_46403 : Card() {
    override val id = 46403
    override val name = "蛇发女妖佐拉"
    override val description = "<b>战吼：</b>选择一个友方随从。将它的金色复制置入你的手牌。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "挑战她需要一面光洁的盾牌，或者自残双目。"
    override val artist = "Sean McNally"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5bfa29bd3a23aa0f4bb8b28b68558812dfa1b84e2f4b2686c7e8bd3765793a38.png"
}
