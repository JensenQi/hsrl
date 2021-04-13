package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LesserRubySpellstone_43414 : Card() {
    override val id = 43414
    override val name = "小型法术红宝石"
    override val description = "随机将一张法师法术牌置入你的手牌。 <i>（使用两张元素牌后升级。）</i>"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "“最后一枚石头毁灭了它的主人，无名的法师破解了结界。阿扎里发出绝望的咆哮，被封入虚空，再也不见踪迹。”——《魔石》"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b8cafb819a60008363549abd36fbb5575ac5e5500753404df1f49205fe4c2263.png"
}
