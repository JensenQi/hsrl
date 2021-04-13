package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DeadlyArsenal_47016 : Card() {
    override val id = 47016
    override val name = "致命武装"
    override val description = "揭示你牌库中的一张武器牌。对所有随从造成等同于其攻击力的伤害。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.TheWitchwood
    override val background = "哇喔，血吼！"
    override val artist = "Wayne Reynolds"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/30fa17d24a7f4f4de64aa39f4ba148815cc1d85aa68775ff97e3978901778fbb.png"
}
