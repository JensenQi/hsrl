package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IronJuggernaut_2024 : Card() {
    override val id = 2024
    override val name = "钢铁战蝎"
    override val description = "<b>战吼：</b>将一张“地雷” 牌洗入你对手的牌库。当玩家抽到“地雷”时，便会受到10点伤害。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Gvg
    override val background = "钢铁战蝎守护着奥格瑞玛，并在最近刚获得“月度最佳员工”称号！"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ef5f861e5dc9c0f3139e9f3a4de625737f1d3540181aee173e62aa70adccbc7d.png"
}
