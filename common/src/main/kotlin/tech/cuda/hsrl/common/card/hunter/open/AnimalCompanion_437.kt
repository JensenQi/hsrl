package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AnimalCompanion_437 : Card() {
    override val id = 437
    override val name = "动物伙伴"
    override val description = "随机召唤一个野兽伙伴。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Legacy1635
    override val background = "你可以召唤米莎，雷欧克或是霍弗！霍弗又没用，又爱惹麻烦！"
    override val artist = "Wei Wang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fea72b7e66957f76849ca3eb096bfbd84f1f0aa5c6683710a2f4c5b1c939ba02.png"
}
