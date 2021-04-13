package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class JungleMoonkin_2923 : Card() {
    override val id = 2923
    override val name = "丛林枭兽"
    override val description = "每个玩家获得 <b>法术伤害+2</b>。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Loe
    override val background = "愤怒的大鸡！"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6fdcd4f7b5380b9843699ec99ef2fd4ce04df685b21743c736a02871bb0fc5cc.png"
}
