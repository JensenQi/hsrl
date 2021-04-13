package tech.cuda.hsrl.common.card.demonhunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ImprisonedAntaen_56649 : Card() {
    override val id = 56649
    override val name = "被禁锢的安塔恩"
    override val description = "<b>休眠</b>两回合。 唤醒时，造成10点伤害，随机分配到所有敌人身上。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 10
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.AshesOfOutland
    override val background = "能给我配一副超超超超超巨型的镣铐吗？"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/acdfec3db23bed9d9b09316e2bf2ecdf45b7bf99a0bc084b8fae89dff499712a.png"
}
