package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DrakonidCrusher_2257 : Card() {
    override val id = 2257
    override val name = "龙人打击者"
    override val description = "<b>战吼：</b>如果你对手的生命值小于或等于15点，便获得+3/+3。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Brm
    override val background = "不要问龙人任何问题。因为他们的答案肯定是：“就不告诉你，就不告诉你……”"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5988aaf32c99c66720a1627380d1baaa3356b9dcdd93cad89fe4f3e2bd6870a3.png"
}
