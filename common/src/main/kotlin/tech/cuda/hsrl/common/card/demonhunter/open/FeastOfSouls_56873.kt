package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FeastOfSouls_56873 : Card() {
    override val id = 56873
    override val name = "灵魂盛宴"
    override val description = "在本回合中每有一个友方随从死亡，抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.DemonhunterInitiate
    override val background = "想抓住恶魔猎手的胃，先抓住恶魔的魂。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5b44576bde973c0f5073a5b9d3e024ebf61314e60971c69dac13551589c5815a.png"
}
