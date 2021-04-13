package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ChaosNova_57847 : Card() {
    override val id = 57847
    override val name = "混乱新星"
    override val description = "对所有随从造成 4点伤害。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.Legacy1635
    override val background = "伤害输出伊利丹，散播混乱一力担。"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/10e78c632b70fad9f8e73623f800f7cb71edd29f097202337ff044a13d855642.png"
}
