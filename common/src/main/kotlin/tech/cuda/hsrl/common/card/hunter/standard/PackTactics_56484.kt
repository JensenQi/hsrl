package tech.cuda.hsrl.common.card.hunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PackTactics_56484 : Card() {
    override val id = 56484
    override val name = "集群战术"
    override val description = "<b>奥秘：</b>当一个友方随从受到攻击时，召唤一个该随从的3/3的复制。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.AshesOfOutland
    override val background = "“你等着，我这就换我的大号！”"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/34c054212dd4cfd7a5246c106bf83be331f5b307e1352f655521b384cfe048ba.png"
}
