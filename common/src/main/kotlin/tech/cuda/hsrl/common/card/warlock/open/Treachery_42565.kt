package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Treachery_42565 : Card() {
    override val id = 42565
    override val name = "变节"
    override val description = "选择一个友方随从，交给你的 对手。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Kotf
    override val background = "拿人的手短，吃人的嘴软。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7522ac4442f1859a965caf131a9271853c0e2f84d42aa571ea4f75d248d2afc9.png"
}
