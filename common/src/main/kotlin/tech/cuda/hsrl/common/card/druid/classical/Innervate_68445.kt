package tech.cuda.hsrl.common.card.druid.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Innervate_68445 : Card() {
    override val id = 68445
    override val name = "激活"
    override val description = "在本回合中，获得两个 法力水晶。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ClassicCards
    override val background = "有些德鲁伊做梦时都回响着陌生人的喊叫声：“给我个激活！”"
    override val artist = "Doug Alexander"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/01abc57eeb4aab762686fef32a6846d06ea49fc3a882e66e7b5897187c1aec40.png"
}
