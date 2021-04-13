package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FungalFortunes_56677 : Card() {
    override val id = 56677
    override val name = "真菌宝藏"
    override val description = "抽三张牌。 弃掉抽到的所有随从牌。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.AshesOfOutland
    override val background = "弃牌时，没有一个随从是无菇的。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/230bcf21221851f050fdbcb5921d7479d20a20c7720acf8ba12c5ae061322bea.png"
}
