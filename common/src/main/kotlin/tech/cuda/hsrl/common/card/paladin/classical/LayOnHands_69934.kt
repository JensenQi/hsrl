package tech.cuda.hsrl.common.card.paladin.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LayOnHands_69934 : Card() {
    override val id = 69934
    override val name = "圣疗术"
    override val description = "恢复 8点生命值，抽三张牌。"
    override var cost: Int? = 8
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ClassicCards
    override val background = "抓住最后一根救命稻草。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/65972f5eda90e4504cdd1b3eaec449c3785457970d7ccac6ea7fbcb375ad076c.png"
}
