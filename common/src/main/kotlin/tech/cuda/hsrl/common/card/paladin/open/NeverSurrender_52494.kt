package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NeverSurrender_52494 : Card() {
    override val id = 52494
    override val name = "永不屈服"
    override val description = "<b>奥秘：</b>当你的对手施放一个法术时，使你的所有随从获得+2生命值。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.RiseOfShadows
    override val background = "永不贪婪，绝不放弃。"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8e5ac36108f2debb55f05c3b4a27601829357d795c42ac73e709a2c3b0f64000.png"
}
