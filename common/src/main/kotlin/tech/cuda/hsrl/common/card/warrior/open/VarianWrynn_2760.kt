package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VarianWrynn_2760 : Card() {
    override val id = 2760
    override val name = "瓦里安·乌瑞恩"
    override val description = "<b>战吼：</b>抽三张牌。将抽到的随从牌直接置入战场。"
    override var cost: Int? = 10
    override var health: Int? = 7
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Tgt
    override val background = "联盟的统治者！安度因的父亲！同时他还喜欢玩竞技模式，场均12胜。"
    override val artist = "Wei Wang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/69a5d131457f38dab57b547d6ce15b1a24646e4070a666e184b541f75f5b272f.png"
}
