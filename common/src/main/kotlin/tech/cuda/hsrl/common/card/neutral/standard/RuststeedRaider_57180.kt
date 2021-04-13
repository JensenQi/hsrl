package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RuststeedRaider_57180 : Card() {
    override val id = 57180
    override val name = "锈骑劫匪"
    override val description = "<b>嘲讽，突袭， 战吼：</b>在本回合获得+4攻击力。"
    override var cost: Int? = 5
    override var health: Int? = 8
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.AshesOfOutland
    override val background = "外域摩托越野大奖赛的三冠王（也是唯一的幸存选手）！"
    override val artist = "Ware Lee"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1a598242d003b4f747c627728ab437c38e72acf6026eca176375705076e6317b.png"
}
