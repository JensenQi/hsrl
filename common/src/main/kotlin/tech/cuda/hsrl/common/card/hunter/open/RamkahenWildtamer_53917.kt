package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RamkahenWildtamer_53917 : Card() {
    override val id = 53917
    override val name = "拉穆卡恒驯兽师"
    override val description = "<b>战吼：</b>随机复制一张你手牌中的野兽牌。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "“不听话就送你去荣誉室！”"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a7386b33228f97c788c0c3a862c328b85ebfa86f07f332d342c14c745913cdb4.png"
}
