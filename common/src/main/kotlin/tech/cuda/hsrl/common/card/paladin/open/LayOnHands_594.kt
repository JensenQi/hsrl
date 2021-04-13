package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LayOnHands_594 : Card() {
    override val id = 594
    override val name = "圣疗术"
    override val description = "恢复 8点生命值，抽三张牌。"
    override var cost: Int? = 8
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Legacy3
    override val background = "抓住最后一根救命稻草。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ea4c0feed75891e4ef206207ac318ace95a36e2eb67d0a0ed79ae06091b5a23b.png"
}
