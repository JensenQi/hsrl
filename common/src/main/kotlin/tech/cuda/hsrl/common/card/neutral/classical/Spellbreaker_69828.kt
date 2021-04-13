package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Spellbreaker_69828 : Card() {
    override val id = 69828
    override val name = "破法者"
    override val description = "<b>战吼：</b> <b>沉默</b>一个随从。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "破法者能够轻易地破除施法者制造的法术，整个过程就像大夫看门诊一样，毫无痛苦。"
    override val artist = "Matt Cavotta"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2cd13bd0a7fdf879dc9a73447ecf19c271dcf42bd490a84fc4bf683efd987e77.png"
}
