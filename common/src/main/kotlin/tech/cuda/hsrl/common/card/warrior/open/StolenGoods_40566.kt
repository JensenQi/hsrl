package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StolenGoods_40566 : Card() {
    override val id = 40566
    override val name = "失窃物资"
    override val description = "随机使你手牌中的一张具有<b>嘲讽</b>的随从牌获得+3/+3。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Msog
    override val background = "这些东西都是我捡来的，我发誓！"
    override val artist = "Mark Gibbons"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7a3d4689d1b5bfcb83d350c2c8850debbd742df2b092241380dc7c19c1570c82.png"
}
