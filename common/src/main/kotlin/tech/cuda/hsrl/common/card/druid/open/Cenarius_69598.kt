package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Cenarius_69598 : Card() {
    override val id = 69598
    override val name = "塞纳留斯"
    override val description = "<b>抉择：</b>使你的所有其他随从获得+2/+2；或者召唤两个2/2并具有<b>嘲讽</b>的树人。"
    override var cost: Int? = 8
    override var health: Int? = 8
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Core
    override val background = "“当它们还是种子的时候，我便认识它们了……”"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/259f1ecadfcafae4e60e30ebeb33e8891afc1f43b1cd80c7a55db35a492e746f.png"
}
