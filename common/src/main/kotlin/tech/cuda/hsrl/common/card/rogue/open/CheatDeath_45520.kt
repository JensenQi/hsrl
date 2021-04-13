package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CheatDeath_45520 : Card() {
    override val id = 45520
    override val name = "诈死"
    override val description = "<b>奥秘：</b>当一个友方随从死亡时，将其移回你的手牌，它的法力值消耗减少（2）点。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "已举报。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1177a63259da4becfb62faf867d90617d262976862a36c504cf79e6c47cac4ee.png"
}
