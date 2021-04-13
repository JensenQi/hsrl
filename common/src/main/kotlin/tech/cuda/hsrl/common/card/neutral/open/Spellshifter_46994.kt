package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Spellshifter_46994 : Card() {
    override val id = 46994
    override val name = "幻术士"
    override val description = "<b>法术伤害+1</b> 如果这张牌在你的手牌中，每个回合使其攻击力和生命值互换。"
    override var cost: Int? = 2
    override var health: Int? = 4
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "他身手了得。潜伏、侦查、谍报，样样精通。"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7856affbe6b30f7aefe64aacb7bfa3fd835fb1d8948d1144da1760411dcfc451.png"
}
