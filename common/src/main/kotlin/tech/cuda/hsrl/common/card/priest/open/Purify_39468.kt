package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Purify_39468 : Card() {
    override val id = 39468
    override val name = "净化"
    override val description = "<b>沉默</b>一个友方随从，抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Karazhan
    override val background = "净化心灵的第一步，就是先把嘴闭上。"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fedb57b9b21a92d979cd703d4da40f4dcdf63f6c2a218873a25daaf02474ee7c.png"
}
