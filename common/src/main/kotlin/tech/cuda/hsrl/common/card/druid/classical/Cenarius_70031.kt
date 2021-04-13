package tech.cuda.hsrl.common.card.druid.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Cenarius_70031 : Card() {
    override val id = 70031
    override val name = "塞纳留斯"
    override val description = "<b>抉择：</b>使你的所有其他随从获得+2/+2；或者召唤两个2/2并具有<b>嘲讽</b>的树人。"
    override var cost: Int? = 9
    override var health: Int? = 8
    override var attack: Int? = 5
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ClassicCards
    override val background = "“当它们还是种子的时候，我便认识它们了……”"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a543f7671feead6d3cda27afb20e68107a3ccf6aa9abedbbff56b0d676112d90.png"
}
