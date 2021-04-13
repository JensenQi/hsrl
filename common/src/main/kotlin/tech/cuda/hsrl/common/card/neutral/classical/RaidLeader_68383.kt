package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RaidLeader_68383 : Card() {
    override val id = 68383
    override val name = "团队领袖"
    override val description = "你的其他随从获得+1攻击力。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "“谁再敢OT的，扣掉50DKP！”"
    override val artist = "Phill Gonzales"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ca33cfd40c3bcafdb2547a6f54c5c1720b105325f833d7a671eb81381bbd8aab.png"
}
