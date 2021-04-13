package tech.cuda.hsrl.common.card.hunter.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AnimalCompanion_68529 : Card() {
    override val id = 68529
    override val name = "动物伙伴"
    override val description = "随机召唤一个野兽伙伴。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ClassicCards
    override val background = "你可以召唤米莎，雷欧克或是霍弗！霍弗又没用，又爱惹麻烦！"
    override val artist = "Wei Wang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f3dc9579d2fccb8810f02d3a161dce130459d673f6bf9316e963fbbde2e2dd25.png"
}
