package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Duskbat_46904 : Card() {
    override val id = 46904
    override val name = "夜行蝙蝠"
    override val description = "<b>战吼：</b>如果你的英雄在本回合受到过伤害，召唤两只1/1的 蝙蝠。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.TheWitchwood
    override val background = "它们是一咬钟情。现在结了婚，还有了两个孩子。"
    override val artist = "Jiajun Tian"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/837e5b30581c78218ef48fa61c1232c180bdd3851d99c9aab72f0c4205137137.png"
}
